<template>

    <v-data-table
        :headers="headers"
        :items="숙소조회"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: '숙소조회View',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
            ],
            숙소조회 : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/숙소조회'))

            temp.data._embedded.숙소조회.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.숙소조회 = temp.data._embedded.숙소조회;
        },
        methods: {
        }
    }
</script>

