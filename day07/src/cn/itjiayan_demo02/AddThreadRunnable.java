package cn.itjiayan_demo02;



	/*请按如下要求编写多线程程序：
            1.得到一个随机的整数n，创建n个子线程对象。
            2.要求在子线程中把当前线程的名称作为元素添加一个集合中。
            3.当n个线程的名称都添加到集合中，遍历集合打印每个线程的名称。*/


import java.util.ArrayList;


public class AddThreadRunnable implements Runnable{


  private  int allThreadNum ;

    public AddThreadRunnable(int allThreadNum) {
        this.allThreadNum = allThreadNum;
    }

    ArrayList<String> list=new ArrayList<String>();




    @Override
    public void run() {


        synchronized (list) {


            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (allThreadNum > 0) {

                list.add(Thread.currentThread().getName() + "----" + allThreadNum);
                allThreadNum--;

            } else {

                System.out.println("所有集合已经添加完毕");
                for (int i = 0; i < list.size(); i++) {
                    System.out.println(list.get(i));
                }
            }
        }



    }
}
