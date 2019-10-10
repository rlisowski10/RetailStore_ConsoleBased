public class Supplier {

  // ============================================================
  // Member Variables
  // ============================================================

  private int id;
  private String name;
  private String address;
  private String contact;

  // ============================================================
  // Constructors
  // ============================================================

  public Supplier(int id, String name, String address, String contact) {
    this.setId(id);
    this.setName(name);
    this.setAddress(address);
    this.setContact(contact);
  }

  // ============================================================
  // Accessors
  // ============================================================

  public String getContact() {
    return contact;
  }

  public void setContact(String contact) {
    this.contact = contact;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }
}