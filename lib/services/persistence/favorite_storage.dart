import '../../models/favorite_color.dart';
import 'hive_service.dart';

class FavoriteStorage {
  List<FavoriteColor> getAllFavorites() => HiveService.favoritesBox.values.toList();

  FavoriteColor? getFavorite(String id) => HiveService.favoritesBox.get(id);

  Future<void> saveFavorite(FavoriteColor favorite) async {
    await HiveService.favoritesBox.put(favorite.id, favorite);
  }

  Future<void> deleteFavorite(String id) async {
    await HiveService.favoritesBox.delete(id);
  }
}
