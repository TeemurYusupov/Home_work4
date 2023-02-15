import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Task1 {
    // Дан Deque состоящий из последовательности цифр.
    // Необходимо проверить, что последовательность цифр является палиндромом
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        boolean t = true;
        for(int i=0;i<a.length;i++)
            if(a[i]!=a[a.length-i-1])t=false;
        System.out.println(t?"Это полиндром ":" Это не полиндром");
 
        
    }

    public boolean checkOn(Deque<Integer> deque) {

        return false;
    }

}
