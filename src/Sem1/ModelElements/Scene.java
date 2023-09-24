package Sem1.ModelElements;

import java.util.ArrayList;


public class Scene {
    int id;
    ArrayList<PoligonalModel> models = new ArrayList<>();
    ArrayList<Flash> flashes = new ArrayList<>();
    ArrayList<Camera> cameras = new ArrayList<>();

    public  Scene(int id, ArrayList<PoligonalModel> models,
                  ArrayList<Flash> flashes, ArrayList<Camera> cameras) throws Exception{
        this.id = id;
        this.models = models;
        this.cameras = cameras;
        this.flashes = flashes;
    }
    public static Scene get(int nScene) {
        return null;
    }

    public Object method1(Object in1){
        return in1;
    }

    public Object method2(Object in1, Object in2){
        Object ret = new Object();
        return ret;
    }
}
