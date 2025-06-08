package in.ineuron.persistent;

import java.time.LocalDateTime;
import java.util.Objects;

public class CodeExample {

	private String dateTimeStamp;
	private int customerNumber;
	private int accountNumber;
	private String accountName;
	private String productType;
	private String registration;
	private String role;
	private long clientEnterpriseCode;
	private double totalBalance;
	private double eligibleBalance;
	private String reasonMessage;
	private boolean acctEligibleToPlgd;
	private boolean acctEligibleBalCalc;
	public String getDateTimeStamp() {
		return dateTimeStamp;
	}
	public void setDateTimeStamp(String dateTimeStamp) {
		this.dateTimeStamp = dateTimeStamp;
	}
	public int getCustomerNumber() {
		return customerNumber;
	}
	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getRegistration() {
		return registration;
	}
	public void setRegistration(String registration) {
		this.registration = registration;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public long getClientEnterpriseCode() {
		return clientEnterpriseCode;
	}
	public void setClientEnterpriseCode(long clientEnterpriseCode) {
		this.clientEnterpriseCode = clientEnterpriseCode;
	}
	public double getTotalBalance() {
		return totalBalance;
	}
	public void setTotalBalance(double totalBalance) {
		this.totalBalance = totalBalance;
	}
	public double getEligibleBalance() {
		return eligibleBalance;
	}
	public void setEligibleBalance(double eligibleBalance) {
		this.eligibleBalance = eligibleBalance;
	}
	public String getReasonMessage() {
		return reasonMessage;
	}
	public void setReasonMessage(String reasonMessage) {
		this.reasonMessage = reasonMessage;
	}
	public boolean isAcctEligibleToPlgd() {
		return acctEligibleToPlgd;
	}
	public void setAcctEligibleToPlgd(boolean acctEligibleToPlgd) {
		this.acctEligibleToPlgd = acctEligibleToPlgd;
	}
	public boolean isAcctEligibleBalCalc() {
		return acctEligibleBalCalc;
	}
	public void setAcctEligibleBalCalc(boolean acctEligibleBalCalc) {
		this.acctEligibleBalCalc = acctEligibleBalCalc;
	}
	@Override
	public String toString() {
		return "CodeExample [dateTimeStamp=" + dateTimeStamp + ", customerNumber=" + customerNumber + ", accountNumber="
				+ accountNumber + ", accountName=" + accountName + ", productType=" + productType + ", registration="
				+ registration + ", role=" + role + ", clientEnterpriseCode=" + clientEnterpriseCode + ", totalBalance="
				+ totalBalance + ", eligibleBalance=" + eligibleBalance + ", reasonMessage=" + reasonMessage
				+ ", acctEligibleToPlgd=" + acctEligibleToPlgd + ", acctEligibleBalCalc=" + acctEligibleBalCalc + "]";
	}
	public CodeExample(String dateTimeStamp, int customerNumber, int accountNumber, String accountName,
			String productType, String registration, String role, long clientEnterpriseCode, double totalBalance,
			double eligibleBalance, String reasonMessage, boolean acctEligibleToPlgd, boolean acctEligibleBalCalc) {
		super();
		this.dateTimeStamp = dateTimeStamp;
		this.customerNumber = customerNumber;
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.productType = productType;
		this.registration = registration;
		this.role = role;
		this.clientEnterpriseCode = clientEnterpriseCode;
		this.totalBalance = totalBalance;
		this.eligibleBalance = eligibleBalance;
		this.reasonMessage = reasonMessage;
		this.acctEligibleToPlgd = acctEligibleToPlgd;
		this.acctEligibleBalCalc = acctEligibleBalCalc;
	}
	public CodeExample() {
		super();
	}
	@Override
	public int hashCode() {
		return Objects.hash(accountName, accountNumber, acctEligibleBalCalc, acctEligibleToPlgd, clientEnterpriseCode,
				customerNumber, dateTimeStamp, eligibleBalance, productType, reasonMessage, registration, role,
				totalBalance);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CodeExample other = (CodeExample) obj;
		return Objects.equals(accountName, other.accountName) && accountNumber == other.accountNumber
				&& acctEligibleBalCalc == other.acctEligibleBalCalc && acctEligibleToPlgd == other.acctEligibleToPlgd
				&& clientEnterpriseCode == other.clientEnterpriseCode && customerNumber == other.customerNumber
				&& Objects.equals(dateTimeStamp, other.dateTimeStamp)
				&& Double.doubleToLongBits(eligibleBalance) == Double.doubleToLongBits(other.eligibleBalance)
				&& Objects.equals(productType, other.productType) && Objects.equals(reasonMessage, other.reasonMessage)
				&& Objects.equals(registration, other.registration) && Objects.equals(role, other.role)
				&& Double.doubleToLongBits(totalBalance) == Double.doubleToLongBits(other.totalBalance);
	}
	
	
}
