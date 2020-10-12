public class TriangleClassifier {
    private double a = 0;
    private double b = 0;
    private double c = 0;

    public TriangleClassifier(double a,double b,double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    //tam giac deu
    public boolean isEquilateralTriangle(double a,double b,double c){
        if(a == b && b == c){
            if(isTriangle(a,b,c)) {
                return true;
            }
        }
        return false;
    }
    //tam giac can
    public boolean isIsoscelesTriangle(double a,double b,double c){
        if(a == b || b == c || c == a){
            if(isTriangle(a,b,c)) {
                return true;
            }
        }
        return false;
    }
    //tam giac thuong
    public boolean isTriangle(double a,double b,double c){
        if(a + b <= c || b + c <= a || c + a <= b){
            return false;
        }
        return true;
    }
    public String classifier(){
        if(isEquilateralTriangle(this.a,this.b,this.c)){
            return "TAM GIAC DEU";
        }else if(isIsoscelesTriangle(this.a,this.b,this.c)){
            return "TAM GIAC CAN";
        }else if(isTriangle(this.a,this.b,this.c)){
            return "TAM GIAC THUONG";
        }else {
            return "KHONG PHAI LA TAM GIAC";
        }
    }

}
