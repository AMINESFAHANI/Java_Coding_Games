import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class StraemApiStringList {


    public static void main(String[] args){
        ArrayList<String> stringList = new ArrayList<String>();
        stringList.add("nitin");
        stringList.add("sachin");
        stringList.add("anoop");
        stringList.add("ajay");

        System.out.println(stringList.stream().count());

        // display record that start with 'a' in stringList
        stringList.stream().filter(x->x.toCharArray()[0]=='a').sorted((a,b)->b.compareTo(a)).forEach(System.out::println);

        //display all record in upper case that starts with 'a' in stringList
        stringList.stream().filter(x->x.startsWith("a")).map(x->x.toUpperCase()).forEach(System.out::println);

        // In one line check whether any record starts with 'a' in stringList
        boolean a =stringList.stream().anyMatch(x->x.startsWith("a"));
        System.out.println(a);

        boolean b = stringList.stream().allMatch(x->x.startsWith("a"));
        System.out.println(b);
         IntStream.of(1,2,3,4,5,6).filter(x->x%2==0).sum();
        System.out.println(DoubleStream.of(1.1,1.2,1.4,1.5).reduce(0,(x,y)->(x+y)));
        int sum = IntStream.range(1,6).sum();
        OptionalInt B = OptionalInt.of(7);
        System.out.println(B.orElse(8));
        Predicate<Integer> noGreaterThan5 = x -> x > 5;
        Integer a2=9;
        System.out.println(a2.compareTo(4));
        Function<String, Integer> func = x -> x.length();

        Integer apply = func.apply("test");   // 6

        System.out.println(apply);

        Supplier<LocalDateTime> s = () -> LocalDateTime.now();
        LocalDateTime time = s.get();

        System.out.println(time);

       // Supplier<String> s1 = () -> dtf.format(LocalDateTime.now());
      //  String time2 = s1.get();

       // System.out.println(time2);






























    }
}
