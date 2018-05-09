package Engine;
import javafx.scene.layout.Region;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.stage.Window;

public class ApplicationLauncher extends Region {
    public ApplicationLauncher(Stage stage, Window owner){
        super();
        stage.setX(super.getLayoutX());
        stage.setY(super.getLayoutY());
        stage.setWidth(EditorVariables.APPLICATIONSIZE);
        stage.setHeight(EditorVariables.APPLICATIONSIZE);
        stage.setResizable(false);
        stage.initOwner(owner);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.show();
    }
}
