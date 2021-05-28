//Author Nico

    var serviceEndpointURL = "http://trangecino.herokuapp.com"


    function register(email, password, CompanyName, surname, familyname, callback){
        $.ajax({
        type: "POST",
        contentType: "application/json",
        url: serviceEndpointURL + "/api/Admin",
        data: JSON.stringify({
            "email": email,
            "password": password,
            "CompanyName": CompanyName,
            "surname": surname,
            "name": familyname,
        }),
        success: function(data, textStatus, response) {
                callback(true);
        },
        error: function(jqXHR, textStatus, errorThrown){
                console.log(jqXHR, textStatus, errorThrown);
                callback(false);
        },
        });
    };

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
                        },
            });
    };

    function PostEmployee(name, email, password, familyname){
            $.ajax({
            type: "POST",
            contentType: "application/json",
            url: serviceEndpointURL + "/api/Employee",
            data: JSON.stringify({
                "name": name,
                "email": email,
                "password": password,
                "familyname": familyname,
            }),
            success: function (data, textStatus, response) {
                            callback(true);

            },
            error: function (jqXHR, textStatus, errorThrown) {
                            console.log(jqXHR, textStatus, errorThrown);
                            callback(false);
            },

            });
    }

    function PostHR(name, email, password, familyname){
            $.ajax({
            type: "POST",
            contentType: "application/json",
            url: serviceEndpointURL + "/api/HR",
            data: JSON.stringify({
                    "name": name,
                    "email": email,
                    "password": password,
                    "familyname": familyname,
            }),

            success: function (data, textStatus, response) {
                                        callback(true);
                        },
            error: function (jqXHR, textStatus, errorThrown) {
                                        console.log(jqXHR, textStatus, errorThrown);
                                        callback(false);
                        },

            });
    };

    function PostWorkSchedule(employee, OutOfOffice, date, projectname){
                $.ajax({
                type: "POST",
                contentType: "application/json",
                url: serviceEndpointURL + "/api/Workschedule",
                data: JSON.stringify({

                        "employee": employee,
                        "OutOfOffice" : OutOfOffice,
                        "date": date,
                        "Project": projectname,
                }),

                success: function (data, textStatus, response) {
                                            callback(true);

                },
                error: function (jqXHR, textStatus, errorThrown) {
                                            console.log(jqXHR, textStatus, errorThrown);
                                            callback(false);
                            },

                });
        };


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
    };

    function GetEmployee(ID, callback){
            $.ajax({
                type: "GET",
                datatype: "json",
                url: serviceEndpointURL + "/api/Employee" + ID,

                success: function(data, textStatus, response) {
                    callback(data);
                },

                error: function(jqXHR, textStatus, errorThrown){
                    console.log(jqXHR, textStatus, errorThrown);
                },
            });
        };

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
        };

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
            };

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
            };

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
            };

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
                };

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
                };

    function putHR(HRID, email, password, name, familyname, callback ){
            $.ajax({
                type: "PUT",
                contentType: "application/json",
                url: serviceEndpointURL + "/api/HR/" + HRID,
                data: JSON.stringify({
                    "HRID": HRID,
                    "email": email,
                    "password": password,
                    "name": name,
                    "familyname": familyname
                }),
                success: function(data, textStatus, response){
                    callback(data);
                },
                error: function(jqXHR, textStatus, errorThrown) {
                    console.log(jqXHR, textStatus, errorThrown);
                },
            });

        };

    function putEmployee(ID, email, password, name, familyname, callback ){
                $.ajax({
                    type: "PUT",
                    contentType: "application/json",
                    url: serviceEndpointURL + "/api/Employee/" + ID,
                    data: JSON.stringify({
                        "ID": ID,
                        "email": email,
                        "password": password,
                        "name": name,
                        "familyname": familyname
                    }),
                    success: function(data, textStatus, response){
                        callback(data);
                    },
                    error: function(jqXHR, textStatus, errorThrown) {
                        console.log(jqXHR, textStatus, errorThrown);
                    },
                });

            };

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
                "name": familyname
            }),
            success: function(data, textStatus, response){
                callback(data);
            },
            error: function(jqXHR, textStatus, errorThrown) {
                console.log(jqXHR, textStatus, errorThrown);
            },
        });

    };

    function putWorkschedule(WorkscheduleID, StartMorning, Lunch, StartAfternoon, EndDay, OutOfOffice, callback ){
            $.ajax({
                type: "PUT",
                contentType: "application/json",
                url: serviceEndpointURL + "/api/Workschedule/" + WorkscheduleID,
                data: JSON.stringify({
                    "WorkscheduleID": WorkscheduleID,
                    "StartMorning": StartMorning,
                    "Lunch": Lunch,
                    "StartAfternoon": StartAfternoon,
                    "EndDay": EndDay,
                    "OutOfOffice": OutOfOffice
                }),
                success: function(data, textStatus, response){
                    callback(data);
                },
                error: function(jqXHR, textStatus, errorThrown) {
                    console.log(jqXHR, textStatus, errorThrown);
                },
            });

        };

    function deleteAdmin(AdminID, callback){
        $.ajax({
            type: "DELETE",
            contentType: "application/json",
            url: serviceEndpointURL + "/api/Admin" + AdminID,
            success: function(data, textStatus, response){
                     callback(data);
                     },
            error: function(jqXHR, textStatus, errorThrown) {
                     console.log(jqXHR, textStatus, errorThrown);
            },

        });
    };

    function deleteHR(HRID, callback){
            $.ajax({
                type: "DELETE",
                contentType: "application/json",
                url: serviceEndpointURL + "/api/HR" + HRID,
                success: function(data, textStatus, response){
                         callback(data);
                         },
                error: function(jqXHR, textStatus, errorThrown) {
                         console.log(jqXHR, textStatus, errorThrown);
                },

            });
        };

     function deleteEmployee(ID, callback){
                 $.ajax({
                     type: "DELETE",
                     contentType: "application/json",
                     url: serviceEndpointURL + "/api/Employee" + ID,
                     success: function(data, textStatus, response){
                              callback(data);
                              },
                     error: function(jqXHR, textStatus, errorThrown) {
                              console.log(jqXHR, textStatus, errorThrown);
                     },

                 });
             };
    function deleteWorkschedule(WorkscheduleID, callback){
                     $.ajax({
                         type: "DELETE",
                         contentType: "application/json",
                         url: serviceEndpointURL + "/api/Workschedule" + WorkscheduleID,
                         success: function(data, textStatus, response){
                                  callback(data);
                                  },
                         error: function(jqXHR, textStatus, errorThrown) {
                                  console.log(jqXHR, textStatus, errorThrown);
                         },

                     });
                 };

    //Copied from Andreas Martin: https://github.com/DigiPR/digipr-acrm
    function getURLParameter(name) {
        return decodeURIComponent((new RegExp('[?|&]' + name + '=' + '([^&;]+?)(&|#|;|$)').exec(location.search) || [, ""])[1].replace(/\+/g, '%20')) || null;
    };