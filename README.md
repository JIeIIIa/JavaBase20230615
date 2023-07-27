# Add CI into Project

## GitLab

1. Copy file `.gitlab-ci.yml` to the root of your repository
2. See build results on _GitLab menu -> Build -> Pipelines_

## GitHub

1. Copy `.github` folder to the root of your repository
2. Change settings in GitHub repository to allow `dorny/test-reporter` action.
   Go to _GitHub -> Your repository -> Settings -> Actions -> General -> Workflow permissions_
   and set a checkbox on "Read and write permissions"
3. See build results on _GitHub -> Your repository -> Actions tab_