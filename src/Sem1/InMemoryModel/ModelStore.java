package Sem1.InMemoryModel;

import Sem1.ModelElements.Camera;
import Sem1.ModelElements.Flash;
import Sem1.ModelElements.PoligonalModel;
import Sem1.ModelElements.Scene;

import java.util.ArrayList;

public class ModelStore implements IModelChangeObserver, IModelChanger {
    ArrayList<PoligonalModel> models = new ArrayList<>();
    ArrayList<Scene> scenes = new ArrayList<>();
    ArrayList<Flash> flashes = new ArrayList<>();
    ArrayList<Camera> cameras = new ArrayList<>();

    public Scene getScene(int n_scene){
        return Scene.get(n_scene);
    }

    @Override
    public void NotifyChange() {
        // TODO Auto-generated method stub

    }

    @Override
    public void ApplyUpdateModel() {
        // TODO Auto-generated method stub

    }


}
