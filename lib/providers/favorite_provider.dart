import 'package:flutter/material.dart';
import 'package:uuid/uuid.dart';
import '../core/utils/color_utils.dart';
import '../models/favorite_color.dart';
import '../services/persistence/favorite_storage.dart';

class FavoriteProvider extends ChangeNotifier {
  final FavoriteStorage _storage;
  List<FavoriteColor> _favorites = [];

  FavoriteProvider(this._storage) {
    refresh();
  }

  List<FavoriteColor> get favorites => _favorites;

  void refresh() {
    _favorites = _storage.getAllFavorites();
    notifyListeners();
  }

  Future<void> addFavorite(String name, Color color) async {
    final (x, y) = ColorUtils.colorToCieXy(color);
    final favorite = FavoriteColor(
      id: const Uuid().v4(),
      name: name,
      colorX: x,
      colorY: y,
      colorValue: color.toARGB32(),
    );
    await _storage.saveFavorite(favorite);
    refresh();
  }

  Future<void> deleteFavorite(String id) async {
    await _storage.deleteFavorite(id);
    refresh();
  }
}
