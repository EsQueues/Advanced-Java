import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI {
    public static void main(String[] args) {
        int []arr=new int[10];
        List<Integer>list=new ArrayList<>();

        fillArr(arr);
        fillList(list);
        System.out.println(list);
        System.out.println(Arrays.toString(arr));

//map
        arr = Arrays.stream(arr).map(a -> a * 2).toArray();
        list = list.stream().map(a -> a * 2).collect(Collectors.toList());

        System.out.println(list);
        System.out.println(Arrays.toString(arr));

//filter
        list=list.stream().filter(a->a%2==0).collect(Collectors.toList());
        arr= Arrays.stream(arr).filter(a->a%2==0).toArray();

        System.out.println(list);
        System.out.println(Arrays.toString(arr));


 //foreach
        Arrays.stream(arr).forEach(a-> System.out.println(a));
        list.stream().forEach(a-> System.out.println(a));


        //reduce
        int []arr3=new int[10];
        fillArr(arr3);
        List<Integer>list3=new ArrayList<>();
        fillList(list3);
        int sum1 = Arrays.stream(arr3).reduce((acc, b) -> acc + b).getAsInt();
        int sum2=list.stream().reduce((acc,b)->acc+b).get();
        System.out.println(sum1);
        System.out.println(sum2);


        int []arr4=new int[10];
        fillArr(arr4);
        arr4 = Arrays.stream(arr4).filter(a -> a % 2 == 0).map(a -> a * 2).toArray();
        System.out.println(Arrays.toString(arr4));

        //works for all collections
    }
    private static void fillArr(int[]arr){
        for (int i = 0; i < 10; i++) {
            arr[i] = i + 1;
        }
    }
    private static void fillList(List<Integer> list){
        for(int i=0;i<10;i++){
            list.add(i+1);
        }
    }
}
