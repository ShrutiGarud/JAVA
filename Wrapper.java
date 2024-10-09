class Wrapper{
    public static void main(String[]a){
        Integer iobj=new Integer(11);
        int no=11;

        Integer i=no;  //autoboxing

        int j=iobj.intValue();//unboxing   intValue method

        System.out.println(j);
    }
}