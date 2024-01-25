public class Main {
    public static void main(String[] args) {
        int[] num_list = {1, 2, 3, 4, 5};

        int even;
        int odd ;
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0) {
                even = num_list[i];
                System.out.print(even);
            } else {
                odd = num_list[i];
                System.out.println(odd);
            }
        }
    }
}