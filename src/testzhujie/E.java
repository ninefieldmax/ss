package testzhujie;


    public class E {
        public static void main(String[] args) {
            int step;
            for(step=1;step<=1000;step++){
                if(step%2==1&step%3==2&step%4==3&step%5==4&step%6==5&step%7==0)
                    System.out.println("此台阶的台阶数为"+step);
            }

        }

    }
