//Author Nico

    var serviceEndpointURL = window.location.protocol + "//" + window.location.host;

    function register(email, password, companyname, surname, familyname, callback){
        $.ajax({
        type: "POST",
        contentType: "application/json",
        url: serviceEndpointURL + "admin/register",
        data: JSON.stringify({
            "email": email,
            "password": password,
            "companyname": companyname,
            "surname": surname,
            "familyname": familyname,
        }),
        success: function(data, textStatus, response) {
                callback(true);
        },
        error: function(jqXHR, textStatus, errorThrown){
                console.log(jqXHR, textStatus, errorThrown);
                callback(false);
        }
        });
    }

    function login(email, password, callback){
            $.ajax({
                type: "POST",
                contentType: "application/json",
                url: serviceEndpointURL + "/login",
                data: JSON.stringify({
                            "email": email,
                            "password": password,
                        }),
                success: function (data, textStatus, response) {
                            callback(true);

                },
                error: function (jqXHR, textStatus, errorThrown) {
                            console.log(jqXHR, textStatus, errorThrown);
                            callback(false);
                        }
            });
    }

    function validateLogin(callback) {
        $.ajax({
            type: "HEAD",
            url: serviceEndpointURL + "/validate",
            success: function (data, textStatus, response) {
                callback(true);
            },
            error: function (jqXHR, textStatus, errorThrown) {
                callback(false);
            }
        });
    }

    function PostEmployee(surname, email, password, familyname, department){
            $.ajax({
            type: "POST",
            contentType: "application/json",
            url: serviceEndpointURL + "/employee/create",
            data: JSON.stringify({
                "surname": surname,
                "email": email,
                "password": password,
                "familyname": familyname,
                "department": department,
            }),
            success: function (data, textStatus, response) {
                            callback(true);

            },
            error: function (jqXHR, textStatus, errorThrown) {
                            console.log(jqXHR, textStatus, errorThrown);
                            callback(false);
            }

            });
    }

    function PostHR(surname, email, password, familyname, department){
            $.ajax({
            type: "POST",
            contentType: "application/json",
            url: serviceEndpointURL + "/HR/create",
            data: JSON.stringify({
                    "surname": surname,
                    "email": email,
                    "password": password,
                    "familyname": familyname,
                    "department": department,
            }),

            success: function (data, textStatus, response) {
                                        callback(true);
                        },
            error: function (jqXHR, textStatus, errorThrown) {
                                        console.log(jqXHR, textStatus, errorThrown);
                                        callback(false);
                        }

            });
    }

    function PostWorkSchedule(emploee, OutOfOffice, date, projectname){
                $.ajax({
                type: "POST",
                contentType: "application/json",
                url: serviceEndpointURL + "/workschedule/create",
                data: JSON.stringify({

                        "emploee": employee,
                        "OutOfOffice" : OutOfOffice,
                        "date": date,
                        "projectname": projectname,
                }),

                success: function (data, textStatus, response) {
                                            callback(true);

                },
                error: function (jqXHR, textStatus, errorThrown) {
                                            console.log(jqXHR, textStatus, errorThrown);
                                            callback(false);
                            }

                });
        }


    function GetEmployees(callback){
        $.ajax({
            type: "GET",
            datatype: "json",
            url: serviceEndpointURL + "/customer",

            success: function(data, textStatus, response) {
                callback(data);
            },

            error: function(jqXHR, textStatus, errorThrown){
                console.log(jqXHR, textStatus, errorThrown);
            },
        });
    }

    function GetEmployee(employeeID, callback){
            $.ajax({
                type: "GET",
                datatype: "json",
                url: serviceEndpointURL + "/customer" + employeeID,

                success: function(data, textStatus, response) {
                    callback(data);
                },

                error: function(jqXHR, textStatus, errorThrown){
                    console.log(jqXHR, textStatus, errorThrown);
                },
            });
        }

    function GetHRs(callback){
            $.ajax({
                type: "GET",
                datatype: "json",
                url: serviceEndpointURL + "/HR",

                success: function(data, textStatus, response) {
                    callback(data);
                },

                error: function(jqXHR, textStatus, errorThrown){
                    console.log(jqXHR, textStatus, errorThrown);
                },
            });
        }

    function GetHR(HRID, callback){
                $.ajax({
                    type: "GET",
                    datatype: "json",
                    url: serviceEndpointURL + "/HR" + HRID,

                    success: function(data, textStatus, response) {
                        callback(data);
                    },

                    error: function(jqXHR, textStatus, errorThrown){
                        console.log(jqXHR, textStatus, errorThrown);
                    },
                });
            }

    function GetAdmins(callback){
                $.ajax({
                    type: "GET",
                    datatype: "json",
                    url: serviceEndpointURL + "/admin",

                    success: function(data, textStatus, response) {
                        callback(data);
                    },

                    error: function(jqXHR, textStatus, errorThrown){
                        console.log(jqXHR, textStatus, errorThrown);
                    },
                });
            }

    function GetAdmin(AdminID, callback){
                $.ajax({
                    type: "GET",
                    datatype: "json",
                    url: serviceEndpointURL + "/Admin" + AdminID,

                    success: function(data, textStatus, response) {
                        callback(data);
                    },

                    error: function(jqXHR, textStatus, errorThrown){
                        console.log(jqXHR, textStatus, errorThrown);
                    },
                });
            }

    function GetWorkschedules(callback){
                    $.ajax({
                        type: "GET",
                        datatype: "json",
                        url: serviceEndpointURL + "/Workschedule",

                        success: function(data, textStatus, response) {
                            callback(data);
                        },

                        error: function(jqXHR, textStatus, errorThrown){
                            console.log(jqXHR, textStatus, errorThrown);
                        },
                    });
                }

    function GetWorkschedule(WorkscheduleID, callback){
                    $.ajax({
                        type: "GET",
                        datatype: "json",
                        url: serviceEndpointURL + "/Workschedule" + WorkscheduleID,

                        success: function(data, textStatus, response) {
                            callback(data);
                        },

                        error: function(jqXHR, textStatus, errorThrown){
                            console.log(jqXHR, textStatus, errorThrown);
                        },
                    });
                }

    function putHR(HRID, email, password, surname, familyname, callback ){
            $.ajax({
                type: "PUT",
                contentType: "application/json",
                url: serviceEndpointURL + "HR/edit"
                data: JSON.stringify({
                    "HRID": HRID,
                    "email": email,
                    "password": password,
                    "surname": surname,
                    "familyname": familyname
                }),
                success: function(data, textStatus, response){
                    callback(data);
                },
                error: function(jqXHR, textStatus, errorThrown) {
                    console.log(jqXHR, textStatus, errorThrown);
                },
            });

        }

    function putEmployee(EmployeeID, email, password, surname, familyname, callback ){
                $.ajax({
                    type: "PUT",
                    contentType: "application/json",
                    url: serviceEndpointURL + "employee/edit"
                    data: JSON.stringify({
                        "EmployeeID": EmployeeID,
                        "email": email,
                        "password": password,
                        "surname": surname,
                        "familyname": familyname
                    }),
                    success: function(data, textStatus, response){
                        callback(data);
                    },
                    error: function(jqXHR, textStatus, errorThrown) {
                        console.log(jqXHR, textStatus, errorThrown);
                    },
                });

            }

    function putAdmin(AdminID, email, password, companyname, surname, familyname,callback ){
        $.ajax({
            type: "PUT",
            contentType: "application/json",
            url: serviceEndpointURL + "admin/edit"
            data: JSON.stringify({
                "AdminID": AdminID,
                "email": email,
                "password": password,
                "companyname": companyname,
                "surname": surname,
                "familyname": familyname
            }),
            success: function(data, textStatus, response){
                callback(data);
            },
            error: function(jqXHR, textStatus, errorThrown) {
                console.log(jqXHR, textStatus, errorThrown);
            },
        });

    }

    function putWorkschedule(WorkscheduleID, StartMorning, Lunch, StartAfternoon, EndDay, callback ){
            $.ajax({
                type: "PUT",
                contentType: "application/json",
                url: serviceEndpointURL + "workschedule/edit"
                data: JSON.stringify({
                    "WorkscheduleID": WorkscheduleID,
                    "StartMorning": StartMorning,
                    "Lunch": Lunch,
                    "StartAfternoon": StartAfternoon,
                    "EndDay": EndDay
                }),
                success: function(data, textStatus, response){
                    callback(data);
                },
                error: function(jqXHR, textStatus, errorThrown) {
                    console.log(jqXHR, textStatus, errorThrown);
                },
            });

        }

    //Copied from Andreas Martin: https://github.com/DigiPR/digipr-acrm
    function getURLParameter(name) {
        return decodeURIComponent((new RegExp('[?|&]' + name + '=' + '([^&;]+?)(&|#|;|$)').exec(location.search) || [, ""])[1].replace(/\+/g, '%20')) || null;
    }




