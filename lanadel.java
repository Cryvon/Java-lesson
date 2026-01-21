public class lanadel {
    public static void main(String[] args) {
        int yosh = 19;
        boolean hujjatBor = true;

        if (yosh >= 18) {
            if (hujjatBor) {
                System.out.println("Вы можете получить водительские права!");
            } else {
                System.out.println("Подготовьте ваши документы.");
            }
        } else {
            System.out.println("Вы несовершеннолетний.");
        }
    }
}
