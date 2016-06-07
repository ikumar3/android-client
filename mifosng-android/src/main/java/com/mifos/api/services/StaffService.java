/*
 * This project is licensed under the open source MPL V2.
 * See https://github.com/openMF/android-client/blob/master/LICENSE.md
 */
package com.mifos.api.services;

import com.mifos.api.model.APIEndPoint;
import com.mifos.objects.organisation.Staff;

import java.util.List;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Query;
import rx.Observable;

/**
 * @author fomenkoo
 */
public interface StaffService {

    @GET(APIEndPoint.STAFF + "?status=all")
    Observable<List<Staff>> getStaffForOffice(@Query("officeId") int officeId);


    @GET(APIEndPoint.STAFF)
    void getAllStaff(Callback<List<Staff>> listOfStaffsCallback);

    @GET(APIEndPoint.STAFF + "?isLoanOfficer=true")
    void getFieldStaffForOffice(Callback<List<Staff>> staffListCallback);

}
