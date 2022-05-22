import java.util.ArrayList;
import java.util.Comparator;

public class TestComparator {

    public static void main(String[] args){

        Comparator<Employee> comparator1 = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        Comparator<Employee> comparator2 = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                 if(o1.getSalary()> o2.getSalary()) return 100;
                 else return -2;
            }
        };




        ArrayList<Employee> list = new ArrayList<Employee>();
     list.add(new Employee(1,"amin",3000));
     list.add(new Employee(2,"vivek",4000));
     list.add(new Employee(3,"sachin",9000));

     list.sort(comparator2);
     System.out.println(list);

    }
}
