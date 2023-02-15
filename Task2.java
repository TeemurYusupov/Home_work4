import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Task2 {

    // Даны два Deque представляющие два неотрицательных целых числа. Цифры хранятся
    // в обратном порядке,
    // и каждый из их узлов содержит одну цифру.
    // Сложите два числа и верните сумму в виде связанного списка.
    public static void main(String[] args) {
        Deque<Integer> d1 = new ArrayDeque<>(Arrays.asList(1, 2, 3));
        Deque<Integer> d2 = new ArrayDeque<>(Arrays.asList(5, 4, 7));
        // result [6,6,0,1]

    }

    public Deque<Integer> sum(Deque<Integer> d1, Deque<Integer> d2) {

        String firstNumber = "";
        String secondNumber = "";
        
        // Converts the lists into strings
        while (l1 != null){
            
            firstNumber += Integer.toString(l1.val);
            l1 = l1.next;
            
        }
        
        while (l2 != null){
            
            secondNumber += Integer.toString(l2.val);
            l2 = l2.next;
            
        }
        
        // Reverses the strings
        firstNumber = new StringBuilder(firstNumber).reverse().toString();
        secondNumber = new StringBuilder(secondNumber).reverse().toString();
        
        long additionLong = Long.parseLong(firstNumber) + Long.parseLong(secondNumber);
    
        ListNode solutionList = new ListNode();
        ListNode prevNode = new ListNode();
        ListNode currentNode = solutionList;
        
        while (additionLong > 0){
            
            currentNode.val = (int) additionLong % 10;
            additionLong /= 10;
            
            ListNode nextNode = new ListNode();
            currentNode.next = nextNode;
            prevNode = currentNode;
            currentNode = currentNode.next;
            
        }
        
        prevNode.next = null;
            
        return solutionList;

        
    }

}
