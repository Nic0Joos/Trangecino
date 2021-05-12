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


        });
    }