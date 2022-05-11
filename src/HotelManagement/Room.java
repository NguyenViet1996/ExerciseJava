package HotelManagement;

public class Room {

		private String nameOfRoom;
		private int price;

		public Room(String nameOfRoom, int price) {
				this.nameOfRoom = nameOfRoom;
				this.price = price;
		}

		public String getNameOfRoom() {
				return nameOfRoom;
		}

		public void setNameOfRoom(String nameOfRoom) {
				this.nameOfRoom = nameOfRoom;
		}

		public int getPrice() {
				return price;
		}

		public void setPrice(int price) {
				this.price = price;
		}

}
