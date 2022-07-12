package Com.Oops;

public class StockPortfolio {

	private int noofStockNames = 0;
	private StockData[] stockArray;
	
	public StockPortfolio() {
		stockArray = new StockData[5];
	}

	public void addStockData(String stockName, int noofShares, double sharePrice) {
		stockArray[noofStockNames] = new StockData(stockName, noofShares, sharePrice);
		noofStockNames++;
	}
	private void computeShare() {
		for(int i=0; i<noofStockNames; i++) {
			stockArray[i].calculateSharePrice(this.computeSharePrice(stockArray[i]));
			System.out.println(stockArray[i]);
		}
		}
		public double computeSharePrice(StockData stock) {
			double sharepriceResult = stock.noofShares*stock.sharePrice;
			System.out.println(sharepriceResult);
			return sharepriceResult;
			
		}
		
		public static void main(String[] args) {
		StockPortfolio stockObj = new StockPortfolio();
//			stockObj.addStockData("Dmart",20, 12.5);
//			stockObj.addStockData("Reliance",30, 25.0);
//			stockObj.addStockData("Google",70, 14.3);
//			stockObj.addStockData("Microsoft",40, 5);
		
			
			StockData obj = new StockData();
			obj.setStockName("Dmart");
			stockObj.addStockData(obj.getStockName(), 20, 5);
			obj.setStockName("Reliance");
			stockObj.addStockData(obj.getStockName(), 30, 3);
			stockObj.computeShare();
			stockObj.computeSharePrice(obj);
			
		}
}