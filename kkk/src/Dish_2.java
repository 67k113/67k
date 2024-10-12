public class Dish_2 extends Dish_0 {
    public Dish_2(String name, double price) {
        super(name, price);
        super.name = "宫保鸡丁";
        super.price = 15;
    }

    @Override
    public void profile() {
        System.out.println("宫保鸡丁（Kung Pao Chicken） [1]，是一道闻名中外的特色传统名菜，在鲁菜、川菜、贵州菜中都有收录，其原料、做法有差别。 [2]该菜式的起源于鲁菜中的酱爆鸡丁、贵州菜中的胡辣子鸡丁有关，后被清朝山东巡抚、四川总督丁宝桢改良发扬，形成了一道新菜式——宫保鸡丁，并流传，此道菜也被归纳为北京宫廷菜 [3]。之后宫保鸡丁也流传到国外。宫保鸡丁选用鸡肉为主料，佐以花生米、辣椒等辅料烹制而成；红而不辣、辣而不猛、香辣味浓、肉质滑脆；其入口鲜辣，鸡肉的鲜嫩可以配合花生的香脆。");
    }
}
