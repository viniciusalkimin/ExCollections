import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        List<Double> tempSem = new ArrayList<Double>();
    double soma = 0;
    for(int i = 1; i <=6; i++){
        System.out.println("Qual a temperatura do mês " + i + ": ");
        double temp = sc.nextDouble();
        tempSem.add(temp);
        soma +=temp;
    }
    double mediaTemp = soma/tempSem.size();
    System.out.println("Temperatura semestral: " + tempSem);
    System.out.println("Media de temperatura semestral: " + mediaTemp);

    for(Double temp: tempSem){
        if(temp > mediaTemp){
            int index = tempSem.indexOf(temp);
            switch (index){
                case 0:
                    System.out.println((index + 1) + " - Janeiro: " + temp + " °C");
                    break;
                case 1:
                    System.out.println((index + 1) + " - Fevereiro: " + temp + " °C");
                    break;
                case 2:
                    System.out.println((index + 1) + " - Março: " + temp + " °C");
                    break;
                case 3:
                    System.out.println((index + 1) + " - Abril: " + temp + " °C");
                    break;
                case 4:
                    System.out.println((index + 1) + " - Maio: " + temp + " °C");
                    break;
                case 5:
                    System.out.println((index + 1) + " - Junho: " + temp + " °C");
                    break;
                default:
                    break;
            }
        }
    }

    sc.close();
    }
}
