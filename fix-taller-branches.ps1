$RepoPath = "c:\Users\leidyDi\Desktop\Unidad2"
Set-Location $RepoPath

$targetFolders = @('Taller7','taller8','Taller9','Taller10','Taller11','Taller12')
$branches = @{
    'Taller7' = 'feat/taller7'
    'taller8' = 'feat/taller8'
    'Taller9' = 'feat/taller9'
    'Taller10' = 'feat/taller10'
    'Taller11' = 'feat/taller11'
    'Taller12' = 'feat/taller12'
}

Write-Host "Restaurando main y limpiando estado..." -ForegroundColor Cyan
git switch main
git restore .

foreach ($branch in $branches.Values) {
    if (git branch --list $branch) {
        Write-Host "Eliminando rama local existente: $branch" -ForegroundColor Yellow
        git branch -D $branch
    }
}

foreach ($name in $branches.Keys) {
    $branch = $branches[$name]
    Write-Host "\nCreando rama $branch desde main" -ForegroundColor Cyan
    git switch -c $branch main

    foreach ($folder in $targetFolders) {
        if ($folder -ne $name) {
            git rm -r --ignore-unmatch $folder 2>$null | Out-Null
            if (Test-Path $folder) {
                Remove-Item -Recurse -Force $folder -ErrorAction SilentlyContinue
            }
        }
    }

    if (-not (Test-Path $name)) {
        Write-Host "ERROR: No se encontró la carpeta $name en la rama $branch" -ForegroundColor Red
        continue
    }

    $readmePath = Join-Path $name 'README.md'
    $content = @"
# $branch

Contiene únicamente los archivos del taller $name.
"@
    New-Item -Path $readmePath -ItemType File -Force -Value $content | Out-Null

    git add .
    git commit -m "feat($branch): Contener solo $name"
    Write-Host "Rama $branch creada con éxito." -ForegroundColor Green
}

Write-Host "\nTodos los branches correctos están creados localmente." -ForegroundColor Cyan
git switch main