package Person;
import javax.swing.JOptionPane;
public class Group  {
     private Student[] array;

    public Group(Student[] array) {
        super();
        this.array = array;
    }
    public  Group(){
        super();
    }

    public Student[] getArray() {
        return array;
    }

    public void setArray(Student[] array) {
        this.array = array;
    }

    public void remove(int i){
        array[i]=null;
    }

    public void add(Student x , int i){
        array[i]=x;
    }

    public int  poisk(String s){
      for (int i=0; i<array.length; i++){
       if   (array[i]!=null) {
           String s1 = array[i].getName();
           if (s1.equals(s))
               return i;
       }
       }
         return -1;
    }
 public String[] input(String[] prom) {
     prom[0]= JOptionPane.showInputDialog(null,"Ввод данных о студентах","Имя");
     prom[1]= JOptionPane.showInputDialog(null,"Ввод данных о студентах","Возраст");
     prom[2]= JOptionPane.showInputDialog(null,"Ввод данных о студентах","Пол");
     prom[3]= JOptionPane.showInputDialog(null,"Ввод данных о студентах","Вуз");
     prom[4]= JOptionPane.showInputDialog(null,"Ввод данных о студентах","Курс");
     prom[5]= JOptionPane.showInputDialog(null,"Ввод данных о студентах","Группа");
  return prom;
 }

}
