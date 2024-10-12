public class Dish_1 extends Dish_0 {
    public Dish_1(String name, double price) {
        super(name, price);
        super.name = "臭豆腐";
        super.price = 6;
    }

    @Override
    public void profile() {
        System.out.println("臭豆腐，英文名Stinky Tofu，又名臭干子，是中国传统特色小吃之一，以其独特的“闻起来臭、吃起来香”的风味而闻名。");
    }

}

