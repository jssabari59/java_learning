class jrun{
    String Name;
    int Num;
    
    jrun(String Name,int Num){

    this.Name=Name;
    this.Num=Num;
    }
    void display(){
        System.out.print("Name : "+Name+",Num: "+Num);
    }
    public static void main(String[] args) {
        

    jrun obj1=new jrun("sibi", 9);
    obj1.display();
    }
}

