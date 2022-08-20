public class Location {
		private int xCoord;
		private int yCoord;
	
			
		public Location() {
			
			this.xCoord = 0;
			this.yCoord = 0;
		}//end Location empty Constructor
				
				
		public int[] getCoordinates(){
			
			 int[]   ints2Array = new int[]{ this.xCoord,this.yCoord};
			return  ints2Array;
		}


			public int getxCoord() {
			return xCoord;
		}


		public int getyCoord() {
			return yCoord;
		}


		@Override
		public String toString() {
			return "Location [xCoord=" + xCoord + ", yCoord=" + yCoord + "]";
		}


		public void update(int i, int j) {
			// TODO Auto-generated method stub
			
		}
		
		
	}//end class