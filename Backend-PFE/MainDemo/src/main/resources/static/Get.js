import axios from "axios";

function Get() {



    function get() {
        axios
            .get("https://jsonplaceholder.typicode.com/todos?_limit=4")
            .then((res) => Show(res));
        function Show(res) {
            //variable containing output
            let data = (JSON.stringify(res.data, null, 2));
        }

    }


}

export default Get;
