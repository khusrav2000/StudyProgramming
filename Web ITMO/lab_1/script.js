jQuery('document').ready(function () {
        var x, y, r;

        jQuery('.cradio').on("input", function () {
            alert(" class cradio - was cliced \n" +
                "value = " + this.value );
            y = parseFloat(this.value);
        });

        jQuery('.cradius').on('click', function(){
            r = parseFloat(this.value);
            alert(" R = " + this.value);
        });

        jQuery("#check").on('click', function(){
            var now = new Date();
            x = parseInt(jQuery('#x').val());
            alert(" x = " + x + " y = " + y + " R = " + r );
            var result = false;
            if((x <= 0) && (y <= 0)) {
                if ((x * x) + (y * y) <= r * r) result = true;
            }
            else if((0 <= x) && (0 <= y)){
                if(y <= r - x) result = true;
            }
            else if((0 <= x) && (x <= r) && (-r <= y * 2) && (y <= 0))
                result = true;
            var script_time = (new Date()) - now;
            jQuery('#result_table').append("<tr><td>" + x + "</td><td>" + y + "</td><td>" + r + "</td><td>"
                + result + "</td><td>" + now + "</td><td>" + script_time + "</td><tr/>");
        });

        jQuery('#R_1').on("click", function () { r = 1; });
        jQuery('#R_1_5').on("click", function () { r = 1.5; });
        jQuery('#R_2').on("click", function () { r = 2; });
        jQuery('#R_2_5').on("click", function () { r = 2.5; });
        jQuery('#R_3').on("click", function () { r = 3; });
    });