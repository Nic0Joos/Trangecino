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
    };

    function PostEmployee(surname, email, password, familyname, department){
            $.ajax({
            type: "POST",
            url: serviceEndpointURL + "/employee",
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
    };

    function PostHR(surname, email, password, familyname, department){
            $.ajax({
            type: "POST",
            url: serviceEndpointURL + "/HR",
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
    };


