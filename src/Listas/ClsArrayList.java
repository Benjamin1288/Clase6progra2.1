package Listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClsArrayList {
    public void ejemplo(){
        List<String> taskList=new ArrayList<String>();
        String lectura="ir a votar";
        taskList.add(lectura);
        taskList.add("Hacer compras");
        taskList.add("Sacar al perro");
        taskList.add("Hacer la cama");
        taskList.add("Lavar el carro");

        //System.out.println(taskList);
        //String primerTag=taskList.get(0);
        //System.out.println("Primer:"+primerTag);
        //Remover item
        //taskList.remove(0);
        //primerTag=taskList.get(0);
        //System.out.println("Primer:"+primerTag);

        //iteracion, iterate
        for (String tarea: taskList){
            System.out.println("Tarea:"+tarea);
        }
    }
    public void ListValores(){
        Scanner s=new Scanner(System.in);
        List<Integer> mylist=new ArrayList<>();
        //mylist.add("500");
        //mylist.add("1000");
        //mylist.add("1500");
        //mylist.add("2000");
        //mylist.add("2500");
        System.out.println("Ingrese un numero: ");
        int num=s.nextInt();
        mylist.add(num);
        mylist.add(500);
        mylist.add(1000);
        mylist.add(1500);
        mylist.add(2000);
        mylist.add(2500);
        //System.out.println(mylist);
        int total=0;
        for (int n: mylist){
            total=total+n;
        }
        System.out.println("Sumatoria:"+total);
    }
    public void ListaTareas(){
        List<ClsTaskList> task=new ArrayList<>();
        ClsTaskList tareaIndividual=new ClsTaskList();

        tareaIndividual.setTaskName("Hacer compras");
        tareaIndividual.setTaskDescription("ir a la torre");
        tareaIndividual.setDone(false);
        task.add(tareaIndividual);
        tareaIndividual=new ClsTaskList();

        tareaIndividual.setTaskName("Sacar al perro");
        tareaIndividual.setTaskDescription("Levarlo al parque");
        tareaIndividual.setDone(false);
        task.add(tareaIndividual);
        tareaIndividual=new ClsTaskList();
        tareaIndividual.setTaskName("Hacer la cama");
        tareaIndividual.setTaskDescription("si no lo hago me regañan");
        tareaIndividual.setDone(false);
        task.add(tareaIndividual);
        tareaIndividual=new ClsTaskList();
        tareaIndividual.setTaskName("Ir a votar");
        tareaIndividual.setTaskDescription("Cumplir con mi pais");
        tareaIndividual.setDone(false);
        task.add(tareaIndividual);
        tareaIndividual=new ClsTaskList();

        task.get(1).setDone(true);
        task.get(3).setDone(true);


        int tarea_numero=0;
        for(ClsTaskList tl:task){
            if (tl.isDone()){
                System.out.println(tarea_numero+" Tarea: "+tl.getTaskName()+" Desc: "+tl.getTaskDescription());
            }
            tarea_numero++;
        }

    }
}
