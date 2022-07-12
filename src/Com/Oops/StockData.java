package Com.Oops;

public class StockData {

	    public String stockName;
	    public int noofShares;
	    public double sharePrice;
	    double totalSharePrice = 0;

	    public StockData() {
	    }

	    public StockData(String stockName, int noofShares, double sharePrice) {
	        this.stockName = stockName;
	        this.noofShares = noofShares;
	        this.sharePrice = sharePrice;
	    }
	    public void calculateSharePrice(double totalSharePrice){
	        this.totalSharePrice = totalSharePrice;

	    }

	    public int getNoofShares() {
			return noofShares;
		}

		public void setNoofShares(int noofShares) {
			this.noofShares = noofShares;
		}

		public double getSharePrice() {
			return sharePrice;
		}

		public void setSharePrice(double sharePrice) {
			this.sharePrice = sharePrice;
		}

		public String getStockName() {
	        return stockName;
	    }

	    public void setStockName(String stockName) {
	        this.stockName = stockName;
	    }

	   

	    @Override
	    public String toString() {
	        return "Stock{" +
	                "stockName='" + stockName + '\'' +
	                ", noofShares=" + noofShares +
	                ", sharePrice=" + sharePrice +
	                '}';
	    }
}
