import 'package:flutter/material.dart';
import 'package:provider/provider.dart';
import '../../providers/favorite_provider.dart';
import '../../models/favorite_color.dart';

class FavoritesStrip extends StatelessWidget {
  final ValueChanged<FavoriteColor> onSelect;
  final VoidCallback onAdd;

  const FavoritesStrip({
    super.key,
    required this.onSelect,
    required this.onAdd,
  });

  @override
  Widget build(BuildContext context) {
    final favorites = context.watch<FavoriteProvider>().favorites;

    return SizedBox(
      height: 56,
      child: ListView(
        scrollDirection: Axis.horizontal,
        padding: const EdgeInsets.symmetric(horizontal: 12),
        children: [
          ...favorites.map((fav) => Padding(
                padding: const EdgeInsets.symmetric(horizontal: 4),
                child: GestureDetector(
                  onTap: () => onSelect(fav),
                  onLongPress: () => _showDeleteDialog(context, fav),
                  child: Tooltip(
                    message: fav.name,
                    child: CircleAvatar(
                      radius: 20,
                      backgroundColor: Color(fav.colorValue),
                    ),
                  ),
                ),
              )),
          Padding(
            padding: const EdgeInsets.symmetric(horizontal: 4),
            child: GestureDetector(
              onTap: onAdd,
              child: CircleAvatar(
                radius: 20,
                backgroundColor: Colors.grey[800],
                child: const Icon(Icons.add, size: 20),
              ),
            ),
          ),
        ],
      ),
    );
  }

  void _showDeleteDialog(BuildContext context, FavoriteColor fav) {
    showDialog(
      context: context,
      builder: (ctx) => AlertDialog(
        title: const Text('Delete favorite?'),
        content: Text('Remove "${fav.name}" from favorites?'),
        actions: [
          TextButton(
            onPressed: () => Navigator.pop(ctx),
            child: const Text('Cancel'),
          ),
          TextButton(
            onPressed: () {
              context.read<FavoriteProvider>().deleteFavorite(fav.id);
              Navigator.pop(ctx);
            },
            child: const Text('Delete'),
          ),
        ],
      ),
    );
  }
}
