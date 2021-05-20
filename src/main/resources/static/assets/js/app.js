//Author Nico

serviceEndpointURL = window.location.protocol + "//" + window.location.host;

    function register(email, password, companyname, surname, familyname){
        $.ajax({
        type: "POST",
        url: serviceEndpointURL + "admin/register",
        data: JSON.stringify({
            "email": email,
            "password": password,
            "companyname": companyname,
            "surname": surname,
            "familyname": familyname,
        }),
        //success

        //error

        });
    }

    function PostEmployee(surname, email, password, familyname, department){
            $.ajax({
            type: "POST",
            url: serviceEndpointURL + "/employee/create",
            data: JSON.stringify({
                "surname": surname,
                "email": email,
                "password": password,
                "familyname": familyname,
                "department": department,
            }),

            //success

            //error

            });
    }

    function PostHR(surname, email, password, familyname, department){
            $.ajax({
            type: "POST",
            url: serviceEndpointURL + "/HR/create",
            data: JSON.stringify({
                    "surname": surname,
                    "email": email,
                    "password": password,
                    "familyname": familyname,
                    "department": department,
            }),

            //success

            //error

            });
    }

    function PostWorkSchedule(emploee, OutofOfficeSelect, date, projectname){
                $.ajax({
                type: "POST",
                url: serviceEndpointURL + "/workschedule/create",
                data: JSON.stringify({

                        "emploee": employee,
                        "OutofOfficeSelect" : OutofOfficeSelect,
                        "date": date,
                        "projectname": projectname,
                }),

                //success

                //error

                });
        }


    function GetEmployees(){

    }

    function GetHR(){

    }

    function login(email, password){
        $.ajax({
            type: "POST",
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


