package demo1;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.util.ArrayList;

public class Products {


    public TextField txtName;
    public TextField txtPrice;
    public TextField txtQuantity;
    public TextField txtDescribe;
    public TextField txtCategory;
    public Button txtOut;
    public ArrayList<String> nameList = new ArrayList<>();
    public ArrayList<String> priceList = new ArrayList<>();
    public ArrayList<String> quantityList = new ArrayList<>();
    public ArrayList<String> describeList = new ArrayList<>();
    public ArrayList<String> categoryList = new ArrayList<>();

    public static ObservableList<Controller> listController = FXCollections.observableArrayList();
    public ListView<Controller> lv;
    public static Controller edit;


    public void submit(javafx.event.ActionEvent actionEvent) {
        try {
            String name = txtName.getText();
            String price = txtPrice.getText();
            String quantity = txtQuantity.getText();
            String describe = txtDescribe.getText();
            String category = txtCategory.getText();
            nameList.add(name);
            priceList.add(price);
            quantityList.add(quantity);
            describeList.add(describe);
            categoryList.add(category);
            txtName.clear();
            txtPrice.clear();
            txtQuantity.clear();
            txtDescribe.clear();
            txtCategory.clear();
            for (Controller c: listController){
                if(c.getName().equals(name)) {
                    throw new Exception("Tên san pham đã tồn tại");
                }
            }
            Controller c = new Controller(name,price,quantity,describe,category);
            listController.add(c);
            lv.setItems(listController);


        } catch (Exception e){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText(e.getMessage());
            alert.show();
        }
    }


    public void edit(MouseEvent mouseEvent) {
        edit = lv.getSelectionModel().getSelectedItem();
        txtName.setText(edit.getName());
        txtPrice.setText(edit.getPrice());
        txtQuantity.setText(edit.getQuantity());
        txtDescribe.setText(edit.getDescribe());
        txtCategory.setText(edit.getCategory());
    }

    public void delete(ActionEvent actionEvent) {
        Controller slecter = lv.getSelectionModel().getSelectedItem();
        lv.getItems().remove((slecter));
        txtName.clear();
        txtPrice.clear();
        txtQuantity.clear();
        txtDescribe.clear();
        txtCategory.clear();

    }
}
