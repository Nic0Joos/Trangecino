//Author Nico

    var serviceEndpointURL = "trangecino.herokuapp.com"



    function testingAPI(callback){
        $.ajax({
            type: "GET",
            contentType: "application/json",
            url: "https://postman-echo.com/get",

            success: function(data, textStatus, response) {
                            callback(true);
                  },

             error: function(jqXHR, textStatus, errorThrown){
                            console.log(jqXHR, textStatus, errorThrown);
                            callback(false);
                  },

        });
    }

    function register(email, password, companyname, surname, familyname, callback){
        $.ajax({
        type: "POST",
        contentType: "application/json",
        url: serviceEndpointURL + "/api/Admin",
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

    function PostEmployee(surname, email, password, familyname, department){
            $.ajax({
            type: "POST",
            contentType: "application/json",
            url: serviceEndpointURL + "/api/Employee",
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
            url: serviceEndpointURL + "/api/HR",
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

    function PostWorkSchedule(employee, OutOfOffice, date, projectname){
                $.ajax({
                type: "POST",
                contentType: "application/json",
                url: serviceEndpointURL + "/api/Workschedule",
                data: JSON.stringify({

                        "employee": employee,
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
            url: serviceEndpointURL + "/api/Employee",

            success: function(data, textStatus, response) {
                callback(data);
            },

            error: function(jqXHR, textStatus, errorThrown){
                console.log(jqXHR, textStatus, errorThrown);
            },
        });
    }

    function GetEmployee(EmployeeID, callback){
            $.ajax({
                type: "GET",
                datatype: "json",
                url: serviceEndpointURL + "/api/Employee" + EmployeeID,

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
                url: serviceEndpointURL + "/api/HR",

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
                    url: serviceEndpointURL + "/api/HR/" + HRID,

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
                    url: serviceEndpointURL + "/api/Admin",

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
                    url: serviceEndpointURL + "/api/Admin/" + AdminID,

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
                        url: serviceEndpointURL + "/api/Workschedule",

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
                        url: serviceEndpointURL + "/api/Workschedule/" + WorkscheduleID,

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
                url: serviceEndpointURL + "/api/HR/" + HRID,
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
                    url: serviceEndpointURL + "/api/Employee/" + EmployeeID,
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

    function putAdmin(AdminID, email, password, CompanyName, surname, familyname, callback ){
        $.ajax({
            type: "PUT",
            contentType: "application/json",
            url: serviceEndpointURL + "/api/Admin/" + AdminID,
            data: JSON.stringify({
                "AdminID": AdminID,
                "email": email,
                "password": password,
                "CompanyName": CompanyName,
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
                url: serviceEndpointURL + "/api/Workschedule/" + WorkscheduleID,
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