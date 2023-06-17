class Test2 {
    int i;
    void setValue(int i){
        
        i=i;
    }
    void show()
    {
        System.out.println(i);
    }

}

class xyz {
    public static void main(String [] args) 
    {
       Test2 t = new Test2();
       t.setValue(101);
       t.show();
    }
}
