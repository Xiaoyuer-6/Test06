/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HuYu
 * Date: 2021-05-21
 * Time: 18:08
 */
public class TestDemo2 {

    public static void main(String[] args) {

        int[] a={2,3,4,5,6,7,8,9,2,1};

        Array(a);

    }



    public static boolean isOdd(int i) {

        if (i % 2 == 0) {

            return true;

        }
        return false;
    }

    public static void swap(int i,int j){

        int temp;

        temp =i;

        i=j;

        j=temp;

    }



    public static  int[] Array(int[] a) {

        int i = 0;// 奇数位

        int j = 1;// 偶数位

        while (i < a.length && j < a.length) {

            if (i < a.length && !isOdd(a[i])) {

                i+=2;

            }

            if (j < a.length && isOdd(a[j])) {

                j+=2;

            }

            swap(a[i],a[j]);

        }

        for(int t=0;t<a.length;t++){

            System.out.println(a[t]);



        }

        return a;

    }
}

