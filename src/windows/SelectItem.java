package windows;


public class SelectItem {

 @SuppressWarnings("FieldMayBeFinal")
 private Integer id;
 @SuppressWarnings("FieldMayBeFinal")
 private String label;

 public SelectItem(Integer id, String label) {
  this.id = id;
  this.label = label;
 }

 @Override
 public String toString() {
  return label;
 }

 public Integer getId() {
  return this.id;
 }

 public String getLabel() {
  return this.label;
 }

}