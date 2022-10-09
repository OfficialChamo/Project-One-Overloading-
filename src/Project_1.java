public class Project_1 {
    static void test (){
        int num = 12345;
        System.out.println(num);
    }
    static void test (int a , String b){
        System.out.println(a + " And " + b);
    }
    static void test (String d){
        d = "54abcd";
        System.out.println(d);
    }
    static double test (double e){
        e = 3.89;
        return e;
    }

    public static void main(String[] args) {
        test();
        test(123 , "abc");
        test("tr4");
        System.out.println(test(5));
    }
}
