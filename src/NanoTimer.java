/**
 * Created by EunHan on 2017-03-17.
 */
public class NanoTimer {

    public static void main(String[] args) {


long starttime = System.nanoTime();// 시작점 시간 저장 save time when your code started

/*----------------------------------------
        코드 your codes
----------------------------------------*/

long endtime = System.nanoTime(); // 모든 코드가 실행되고 시간 저장 save time when your code ended

long estimatedTime = endtime - starttime; //시작점과 끝점을 계산하여 걸린 시간 측정 calculate the spending time of your code
System.out.println(estimatedTime); //걸린시간을 출력 show the time.



    }
}
