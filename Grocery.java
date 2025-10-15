class GroceryShop extends Shop {



    public static void main(String[] args) {
        Shop.openShop();
        Shop.closeShop();

        GroceryShop g = new GroceryShop();
        g.sellItem();
        g.restockItem();
    }
}