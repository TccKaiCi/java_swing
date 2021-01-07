package SearchTable;

public class test {

    public static void main(String[] args) {
        Weopon Dark_Sword = new DTOSword(1, 1, "Dark Sword", 100, "The sword get from the dastness in the word!", 2, 15, "darksword.png", false);
        Weopon wand = new DTOWand(10, "Fire", 2, "Wand of Destruction", 500, "Go in to the hell", 10, 20, "wand1.png", true);

        System.out.println(Dark_Sword.toString());
        System.out.println(Dark_Sword.dealDamage());
        System.out.println(wand.toString());
        System.out.println(wand.dealDamage());
    }
}
