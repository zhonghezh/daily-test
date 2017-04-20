package z.fun;

/**
 * TITLE:
 * Created by ZhongHe.[Z] on 2017/4/19.
 */
public class Forfun {

    public static void main(String[] args) {
        int b;
        int x;
        int y;
        int count = 0;
        for (b = 1; b <= 9; b++) {
            int bbb = b + 10 * b + 100 * b;
            for (x = 1; x <= 9; x++) {
                for (y = 1; y <= 9; y++) {
                    if (x * bbb > 1000) {
                        if ((x * bbb) % 10 == 5) {
                            if (y * bbb > 1000) {
                                if ((y * bbb) % 10 == 5) {
                                    int result = bbb * (x + 10 * y);
                                    if (result > 30000) {
                                        if (result < 40000) {
                                            count++;
                                            System.out.println("第" + count + "组解：" + bbb + " x " + y + x + " = " + result + "\n");
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

}
