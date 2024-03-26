import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        generic là tham số hoá cho kiê dữ liê vủa biến
        Collection<Integer> list = new ArrayList<>();
        System.out.println("số lượng ptu trong danh sách là " + list.size());
        //thêm mới
        list.add(4);
        list.add(3);
        list.add(4);
        list.add(6);
        list.add(9);

//in danh sách
        System.out.println(list);

//        xo phần tử
        list.remove(4);
        System.out.println(list);
//kiêm tra tồn tại
        System.out.println("phần tử số 4 có tồn tại trong list hay không: " + list.contains(4));
//kểm tra danh sách có rông hay không
        System.out.println("danh sách " + list.isEmpty());
//        duyệt danh sách
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println("phần tử tiếp theo là : " + iterator.next());
        }

        list.clear();
        System.out.println(list);

//        list collection
        List<String> studentNameList = new LinkedList<>();
//        cung cấp các phương tức làm việc với index
        studentNameList.add("Name");
        studentNameList.add("long");
        studentNameList.add(1, "Duc");
        studentNameList.add(2, "Dang");
        System.out.println(studentNameList);
//        xoá theo vị trí
        studentNameList.remove(1);
        System.out.println(studentNameList);
//        sửa theo vị trí
        studentNameList.set(1, "duc");
        System.out.println(studentNameList);
//        lấy giá trị theo vị trí
        System.out.println("phần tử tại vị trí index = 2 là: " + studentNameList.get(1));
//        tìm vị trí phần tử
        int index = studentNameList.indexOf("long");
        System.out.println(index);
        int lastIndex = studentNameList.lastIndexOf("long");
        System.out.println(lastIndex);
//        sắp ếp
        studentNameList.sort(Comparator.naturalOrder());

        System.out.println(studentNameList);


//        Set-danh sách các phần tử không trùng lặp
        Set<Integer> set = new HashSet<>();
//        Set<Integer> set = new TreeSet<>();
//        Set<Integer> set = new LinkedHashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        System.out.println(set);

        set.remove(3);
        System.out.println(set);
    }
}
