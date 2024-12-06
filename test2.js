<script>
    fetch('/api/v1/images?file=https://github.com/ducws/empty/blob/main/test.js?raw=true')
        .then(response => response.text())
        .then(data => console.log(data));
</script>
