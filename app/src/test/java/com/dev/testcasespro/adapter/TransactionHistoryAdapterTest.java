/* Copyright (c) 2015 Transaction Processing Specialist Inc., A Conduent Company

 * All rights reserved.

*

* This item contains confidential and trade secret information and may not

* be transferred, published, disclosed, reproduced, or used by any party

* without the express written permission of Transaction Processing Specialist Inc., A

Conduent Company.

*/
package com.dev.testcasespro.adapter;

import android.content.Context;

import androidx.test.core.app.ApplicationProvider;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.robolectric.RobolectricTestRunner;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;

@RunWith(RobolectricTestRunner.class)
public class TransactionHistoryAdapterTest {

//    @Mock
//    private Picasso picasso;
//
//    @Before
//    public void setup() {
//        MockitoAnnotations.initMocks(this);
//    }
//
//    @Test
//    public void fullAdapterTest() throws Exception {
//        Context context = ApplicationProvider.getApplicationContext();
//        TransactionHistoryAdapter adapter = new TransactionHistoryAdapter(context, null, picasso);
//        adapter.setBannerImage(getBannerImage());
//        adapter.setAccountSummaryInfo(getAccountSummaryInfo());
//        adapter.setTransactionHistoryInfo(getTransactionHistory(2));
//
//        assertThat(adapter.getItemCount(), is(equalTo(4))); // 1 for header + 2 for transactions + 1 transaction fee summary
//        assertThat(adapter.getItemViewType(0), is(equalTo(R.layout.transaction_history_header)));
//        assertThat(adapter.getItemViewType(1), is(equalTo(R.layout.transaction_history_item_cell)));
//        assertThat(adapter.getItemViewType(2), is(equalTo(R.layout.transaction_history_item_cell)));
//    }
//
//
//    @Test
//    public void emptyAdapterTest() throws Exception {
//        Context context = ApplicationProvider.getApplicationContext();
//        TransactionHistoryAdapter adapter = new TransactionHistoryAdapter(context, null, picasso);
//
//        adapter.setBannerImage(null);
//        adapter.setAccountSummaryInfo(null);
//        adapter.setTransactionHistoryInfo(getTransactionHistory(0));
//
//        assertThat(adapter.getItemCount(), is(equalTo(2))); // empty view + transaction fee summary
//        assertThat(adapter.getItemViewType(0), is(equalTo(R.layout.list_empty_view)));
//    }
//
//    @Test
//    public void nullAdapterTest() throws Exception {
//        Context context = ApplicationProvider.getApplicationContext();
//        TransactionHistoryAdapter adapter = new TransactionHistoryAdapter(context, null, picasso);
//
//        adapter.setBannerImage(null);
//        adapter.setAccountSummaryInfo(null);
//        adapter.setTransactionHistoryInfo(null);
//
//        assertThat(adapter.getItemCount(), is(equalTo(2))); // empty view + transaction fee summary
//        assertThat(adapter.getItemViewType(0), is(equalTo(R.layout.list_empty_view)));
//    }
//
//    @Test
//    public void emptyTransactionsAdapterTest() throws Exception {
//        Context context = ApplicationProvider.getApplicationContext();
//        TransactionHistoryAdapter adapter = new TransactionHistoryAdapter(context, null, picasso);
//        adapter.setBannerImage(getBannerImage());
//        adapter.setAccountSummaryInfo(getAccountSummaryInfo());
//        adapter.setTransactionHistoryInfo(getTransactionHistory(0));
//
//        assertThat(adapter.getItemCount(), is(equalTo(3))); //header + empty view + transaction fee summary
//        assertThat(adapter.getItemViewType(0), is(equalTo(R.layout.transaction_history_header)));
//        assertThat(adapter.getItemViewType(1), is(equalTo(R.layout.list_empty_view)));
//    }
//
//    @Test
//    public void nullTransactionsAdapterTest() throws Exception {
//        Context context = ApplicationProvider.getApplicationContext();
//        TransactionHistoryAdapter adapter = new TransactionHistoryAdapter(context, null, picasso);
//        adapter.setBannerImage(getBannerImage());
//        adapter.setAccountSummaryInfo(getAccountSummaryInfo());
//        adapter.setTransactionHistoryInfo(null);
//
//        assertThat(adapter.getItemCount(), is(equalTo(3))); //header + empty view + transaction fee summary
//        assertThat(adapter.getItemViewType(0), is(equalTo(R.layout.transaction_history_header)));
//        assertThat(adapter.getItemViewType(1), is(equalTo(R.layout.list_empty_view)));
//    }
//
//    @Test
//    public void emptyTransactionsNoAccAdapterTest() throws Exception {
//        Context context = ApplicationProvider.getApplicationContext();
//        TransactionHistoryAdapter adapter = new TransactionHistoryAdapter(context, null, picasso);
//        adapter.setBannerImage(getBannerImage());
//        adapter.setAccountSummaryInfo(null);
//        adapter.setTransactionHistoryInfo(getTransactionHistory(0));
//
//        assertThat(adapter.getItemCount(), is(equalTo(3))); //header + empty view + transaction fee summary
//        assertThat(adapter.getItemViewType(0), is(equalTo(R.layout.transaction_history_header)));
//        assertThat(adapter.getItemViewType(1), is(equalTo(R.layout.list_empty_view)));
//    }
//
//    @Test
//    public void nullTransactionsNoAccAdapterTest() throws Exception {
//        Context context = ApplicationProvider.getApplicationContext();
//        TransactionHistoryAdapter adapter = new TransactionHistoryAdapter(context, null, picasso);
//        adapter.setBannerImage(getBannerImage());
//        adapter.setAccountSummaryInfo(null);
//        adapter.setTransactionHistoryInfo(null);
//
//        assertThat(adapter.getItemCount(), is(equalTo(3))); //header + empty view + transaction fee summary
//        assertThat(adapter.getItemViewType(0), is(equalTo(R.layout.transaction_history_header)));
//        assertThat(adapter.getItemViewType(1), is(equalTo(R.layout.list_empty_view)));
//    }
//
//    //region Helpers
//    private AccountSummaryInfo getAccountSummaryInfo() {
//        AccountSummaryInfo test = new AccountSummaryInfo();
//        test.setDepositNotification("testDepositNotification");
//        test.setProgramName("testProgramName");
//
//        PersonInfo personInfo = new PersonInfo();
//        personInfo.setFirstName("firstName");
//        personInfo.setMiddleInitial("middleInitial");
//        personInfo.setLastName("lastName");
//        personInfo.setSuffix("suffix");
//        personInfo.setSsn("ssn");
//        personInfo.setDob("dob");
//        personInfo.setAddress1("address1");
//        personInfo.setAddress2("address2");
//        personInfo.setCity("city");
//        personInfo.setState("state");
//        personInfo.setZipCode("zipCode");
//        personInfo.setCountry("country");
//        personInfo.setLanguageCode("languageCode");
//        personInfo.setPhoneNbr("phoneNbr");
//        personInfo.setSms("sms");
//        personInfo.setMobileServiceProvider("mobileServiceProvider");
//        personInfo.setEmail("email");
//
//        Balance[] balances = new Balance[2];
//
//        Balance balance1 = new Balance();
//        balance1.setStatus("status1");
//        balance1.setCardNbr("cardNbr1");
//        balance1.setIssueDate("issueDate1");
//        balance1.setFreezeDate("freezeDate1");
//        balance1.setExpireDate("expireDate1");
//        balance1.setBalance("balance1");
//        balances[0] = balance1;
//
//        Balance balance2 = new Balance();
//        balance2.setCardNbr("cardNbr2");
//        balance2.setStatus("status2");
//        balance2.setIssueDate("issueDate2");
//        balance2.setFreezeDate("freezeDate2");
//        balance2.setExpireDate("expireDate2");
//        balance2.setBalance("balance2");
//        balances[1] = balance2;
//
//        test.setBalance(balances);
//        test.setPersonInfo(personInfo);
//
//        return test;
//    }
//
//    private BannerImage getBannerImage() {
//        BannerImage bannerImage = new BannerImage();
//        bannerImage.setImageId(1);
//        bannerImage.setImageTitle("Test");
//        bannerImage.setImageFileURL("www.testFile.com");
//        bannerImage.setImageTargetURL("www.testTarger.com");
//
//        return bannerImage;
//    }
//
//    private TransactionHistoryInfo[] getTransactionHistory(int count) {
//        if (count == 0) {
//            return new TransactionHistoryInfo[0];
//        }
//
//        TransactionHistoryInfo[] result = new TransactionHistoryInfo[count];
//        for (int i = 0; i < count; i++) {
//            result[i] = getTransaction(i);
//        }
//
//        return result;
//    }
//
//    private TransactionHistoryInfo getTransaction(int index) {
//        TransactionHistoryInfo test = new TransactionHistoryInfo();
//
//        test.setStatus(Integer.toString(index));
//        test.setDatePosted("03/22/2017");
//        test.setTransactionDate("04/18/2017");
//        test.setAmount("100.0");
//        test.setMerchant("KFC");
//        test.setLocation("Austin");
//        test.setTransactionType("Purchase");
//        test.setConfirmationNumber("1236547890");
//
//        return test;
//    }

    //endregion
}