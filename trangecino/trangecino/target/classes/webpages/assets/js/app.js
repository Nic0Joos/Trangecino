//This section was written by Nico

serviceEndpointURL = window.location.protocol + "//" + window.location.host;

function createEmployee(email, password, remember, callback){
    $.ajax({
        type: "POST",
        contentType: "application/json",
        headers{

        },
        url: serviceEndpointURL + //API?
        data: JSON.stringify({


        }),

        success: function (){

        },

        error:function () {

        }

    });
}

