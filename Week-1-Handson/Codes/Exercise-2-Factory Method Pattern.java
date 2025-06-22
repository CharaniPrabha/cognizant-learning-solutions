interface FactoryMethodPatternExample{
    public void document();
}
class wordDocument implements FactoryMethodPatternExample{
    public void document(){
        System.out.println("Word");
    }
}
class pdfDocument implements FactoryMethodPatternExample{
    public void document(){
        System.out.println("pdf");
    }
}
class excelDocument implements FactoryMethodPatternExample{
    public void document(){
        System.out.println("Excel");
    }
}
class documenttype{
    public FactoryMethodPatternExample create(String user){
        if(user==null){
            return null;
        }
        switch(user.toLowerCase()){
            case "word":
                return new wordDocument();
            case "pdf":
                return new pdfDocument();
            case "excel":
                return new excelDocument();
        }
        return null;
    }
}
public class FactoryMethod{
    public static void main(String[]args){
        documenttype n = new documenttype();
        FactoryMethodPatternExample n1 = n.create("Word");
        FactoryMethodPatternExample n2 = n.create("pdf");
        n1.document();
        n2.document();
    }
}
